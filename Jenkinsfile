pipeline {
    agent { label 'test-agent' }

    stages {
        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        // stage('Run Unit Tests') {
        //     steps {
        //         sh 'mvn test'
        //     }
        // }

        // stage('Deploy') {
        //     steps {
        //         sh 'nohup java -jar target/*.jar &'
        //     }
        // }
    }

    // post {
    //     success {
    //         echo 'Build and deployment successful!'
    //     }
    //     failure {
    //         echo 'Build failed. Check logs.'
    //     }
    // }
}
