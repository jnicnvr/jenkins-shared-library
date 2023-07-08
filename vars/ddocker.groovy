
def build(String imageTag){
    echo imageTag
    sh 'docker version'
    //docker.build(imageTag)   
}