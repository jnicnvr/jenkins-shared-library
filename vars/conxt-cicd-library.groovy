class ddocker {
    static def build(String imageTag){
        docker.build(imageTag)
    }
}