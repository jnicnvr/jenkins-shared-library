
def build(String imageTag){
    echo imageTag
    //docker.build(imageTag)   
}

def version(){
   sh 'docker version'
}

def setImageName(String artifactoryName, String image, String branch, String buildNumber){
    echo "${artifactoryName}-${image}-${branch}-${buildNumber}"
}