pipeline {
    environment {
        def javaHome = tool 'JDK8';
        def mvnHome = tool 'Maven3';
        def scannerHome = tool 'sonarScanner';
        JAVA_HOME = "${javaHome}";
    }


    agent { label 'WinSlave' }

    stages {
        stage('Test') {
            steps {
                bat "${mvnHome}\\bin\\mvn clean"
                bat "${mvnHome}\\bin\\mvn test"
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    withSonarQubeEnv('sonar') {
                        bat "${scannerHome}\\bin\\sonar-scanner"
                    }
                }
            }
        }
        stage('Quality Gate') {
            steps {
                script {
                    sleep 5
                    def qualitygate = waitForQualityGate()
                    if(qualitygate.status != "OK") {
                        error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}"
                    }
                }
            }
        }
    }
}
