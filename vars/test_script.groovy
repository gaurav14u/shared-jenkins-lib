def build(){
  def request = libraryResource 'scripts/test.sh'
  echo request
  echo 'build app'
}

def test(){
  echo 'test app'
}


def deploy(){
  echo 'deploy app'
}

return this
