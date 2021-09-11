package ScalaBasic.ProxyDesignPattern1

// https://www.bilibili.com/video/BV12N411R726?p=266&spm_id_from=pageDriver

trait State extends Serializable {

  def insertCoin()
  def returnCoin()
  def turnCrank()
  def printState()
  def getstatename(): String
  def dispense()
}
