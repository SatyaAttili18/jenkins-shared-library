def call(String imageName, String imageTag, String dockerHubUser) {
    sh """
      docker login -u ${dockerHubUser}
      docker push ${dockerHubUser}/${imageName}:${imageTag}
    """
}
