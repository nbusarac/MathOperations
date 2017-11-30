pipeline {
    environment {
        def scannerHome = tool 'sonarScanner';
    }


    agent { label 'master' }

    stages {
        stage('Test') {
            steps {
                sh 'mvn clean'
                sh 'mvn test'
                sh 'mvn verify -Ptest,coverage'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonar') {
                    sh '${scannerHome}/bin/sonar-scanner -X'
                }
            }
        }
    }
}
