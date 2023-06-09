pipeline {
  agent any
  stages {
    stage('CheckOut') {
      steps {
        echo 'This is a minimal pipeline.'
        git(url: 'https://github.com/shyamsharma23/restapi-1.0', branch: 'api')
      }
    }

  }
}