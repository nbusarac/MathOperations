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
                    junit 'target/surefire-reports/*.xml'
                    withSonarQubeEnv('sonar') {
                        sh '${scannerHome}/bin/sonar-scanner'
                    }
                }
            }
        }
        stage('Quality Gate') {
            steps {
                script {
                    def qualitygate = waitForQualityGate()
                    if(qualitygate.status != "OK") {
                        error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}"
                    }
                }
            }
        }
    }
}
