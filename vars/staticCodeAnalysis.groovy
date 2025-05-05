def call(String sonarCredentialId) {
    withSonarQubeEnv('sonar-api') {
        sh 'mvn sonar:sonar'
    }
}
