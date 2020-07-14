pipeline {

  agent { label 'linux' }

  stages {
    stage('Test') {
      steps {
        sh 'docker run --rm -v $PWD:/usr/src -w /usr/src golang:latest go version'
      }
    }
  }
}
