
def build(String imageTag){
    echo imageTag
    //docker.build(imageTag)   
}

def version(){
   sh 'docker version'
}