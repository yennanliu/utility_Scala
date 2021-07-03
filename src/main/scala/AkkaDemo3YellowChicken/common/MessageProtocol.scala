package AkkaDemo3YellowChicken.common

// https://www.bilibili.com/video/BV12N411R726?p=244&spm_id_from=pageDriver

/**
 * Case class for msg protocol
 *
 *  1) ClientMessage: client -> server msg protocol (case class implements serialization by default)
 *  2) ServerMessage: server -> client msg protocol (case class implements serialization by default)
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
                          mes: String
                        )

class MessageProtocol {

}
