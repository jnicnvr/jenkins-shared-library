
def build(String imageTag){
    echo imageTag
    //docker.build(imageTag)   
}

def version(){
   sh 'docker version'
}

def setImageNamez(String artifactoryName, String image, String branch, String buildNumber){
    echo "123"
}