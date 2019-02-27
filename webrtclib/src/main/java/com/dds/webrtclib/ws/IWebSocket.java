package com.dds.webrtclib.ws;

import com.dds.webrtclib.EnumMsg;
import com.dds.webrtclib.bean.OtherInfo;
import com.dds.webrtclib.callback.ConnectCallback;

import org.webrtc.IceCandidate;

import java.util.List;

/**
 * Created by dds on 2019/1/3.
 * android_shuai@163.com
 */
public interface IWebSocket {


    void connect(String wss, ConnectCallback callback);

    void close();

    void login(String sessionId);

    void createRoom(String ids, boolean videoEnable);//1=语音，2=视频

    void createRoom(String ids, String groupID, List<OtherInfo> list);

    void sendInvite(String userId);

    void sendAck(String userId);

    // 加入房间
    void joinRoom(String room);

    void sendOffer(String socketId, String sdp);

    void sendAnswer(String socketId, String sdp);

    void sendIceCandidate(String socketId, IceCandidate iceCandidate);

    void decline(String _fromId, EnumMsg.Decline decline);

    //处理回调消息
    void handleMessage(String message);


}
