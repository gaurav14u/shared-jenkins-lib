def build(){
  echo 'build app'
  println System.getProperty("user.dir");
  println '----------------------------'
  def proc = "ls".execute()
  def b = new StringBuffer()
  proc.consumeProcessErrorStream(b)
  println proc.text
  println b.toString()

}

def test(){
  echo 'test app'
}


def deploy(){
  echo 'deploy app'
}

return this
