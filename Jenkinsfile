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
            }
            post {
                always {
                    steps {
                        junit 'target/surefire-reports/*.xml'
                        withSonarQubeEnv('sonar') {
                            sh '${scannerHome}/bin/sonar-scanner -X'
                        }
                    }
                }
            }
        }
    }
}
