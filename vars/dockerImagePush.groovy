def call(Map config) {
    def image = config.image
    def tag = config.tag

    echo "🔍 Scanning Docker image ${image}:${tag} with Trivy..."

    sh """
        trivy image ${image}:${tag}
    """
}
