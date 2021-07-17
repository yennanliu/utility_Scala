package AkkaDemo4SparkMasterWorker.common

// https://www.bilibili.com/video/BV12N411R726?p=246&spm_id_from=pageDriver
// https://www.bilibili.com/video/BV12N411R726?p=247

/**
 *   Message Protocol
 *   - define mag format, case class, case object
 */

class MessageProtocol {

}

// msg that worker sends to master when register (register to master)
case class RegisterWorkerInfo(id: String, cpu: Int, ram: Int)

// worker info, will be saved into the hashmap in sparkMaster ( for worker management)
// this is class will be extended (e.g. : adding last heartbeat time)
// we don't need case for WorkerInfo, since this one will not be sent as msg
class WorkerInfo(val id: String, val cpu: Int, val ram: Int){
  var lastHeartBeat: Long = System.currentTimeMillis()  // last HeartBeat time
}

// for when worker register success in master
// -> master will reply a RegisterWorkerInfo
case object RegisterWorkerInfo

// every few seconds, the timer send msg to worker itself
case object SendHeartBeat
// every few seconds, the timer will trigger worker send heart beat to master
case class HeartBeat(id: String)

// master sends msg to itself that trigger time-out worker check
case object StartTimeOutWorker
// master sends msg to itself that check which worker has time-out heartbeat
case object RemoveTimeOutWorker