package AkkaDemo3YellowChicken.common

// https://www.bilibili.com/video/BV12N411R726?p=244&spm_id_from=pageDriver

/**
 * // use case class for msg protocol
 * // client -> server msf protocol (case class implements serialization by default)
 *
 *
 * Note : case class
 *  1) implements serialization by default
 *  2) implements apply method by default
 */

// client -> server msg
case class ClientMessage(
                          mes: String
                        )
// server -> client msg
case class ServerMessage(
                        mss: String
                        )

class MessageProtocol {

}
