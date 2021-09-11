//package ScalaBasic.ProxyDesignPattern1
//
//// https://www.bilibili.com/video/BV12N411R726?p=266&spm_id_from=pageDriver
//
//// the state the candy is in process
//class SoldState extends State {
//  // attr
//  // @transient will make a tmp state, not part of the object serialization
//  @transient private var mCandyMachine: CandyMachine = _
//
//  // constructor
//  // observe mCandyMachine's state
//  def this(mCandyMachine: CandyMachine)= {
//    this
//    this.mCandyMachine = mCandyMachine
//  }
//
//  // method
//  override def returnCoin(): Unit = {
//    println("coin returned")
//    // if in a has-coin state, then the coin will be back to the candy machine after we run returnCoin() method
//    mCandyMachine.setState(mCandyMachine.mOnReadyState)
//  }
//
//  override def turnCrank(): Unit = {
//
//    print ("crank run ...")
//    val ranwinner = new java.util.Random()
//
//    // set up a random number, if return 0 then give extra candy
//    var winner = ranwinner.nextInt(10)
//
//    if (winner == 0){
//      mCandyMachine.setState(mCandyMachine.mWinnerState)
//    }else {
//      mCandyMachine.setState(mCandyMachine.msoldState)
//    }
//  }
//
//  override def printState(): Unit = {
//    println("*** SoldState ***")
//  }
//
//  override def getstatename(): String = {
//    "SoldState State"
//  }
//
//  override def dispense(): Unit = {
//    mCandyMachine.releaseCandy()
//    if (mCandyMachine.getCount() > 0){
//      mCandyMachine.setState(mCandyMachine.mOnReadystate)
//    }else{
//      println("sold out")
//      mCandyMachine.setState(mCandyMachine.msoldOutState)
//    }
//  }
//
//  override def insertCoin(): Unit = {
//    println("plz wait! we will give u candy shortly")
//  }
//
//}
