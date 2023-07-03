pipeline {
    agent { 
        node {
            label 'jenkins-docker'
            }
      }
    stages{
        stage('Build'){
            steps{
                sh 'docker build . -t restapi:latest'
            }
        }
        stage('Test'){
            steps{
                echo "Testing"
            }
        }
        stage('Deploy'){
            steps{
                sh "docker run -d --name my-container -p 5000:5000 restapi:latest"
            }
        }
    }
}
