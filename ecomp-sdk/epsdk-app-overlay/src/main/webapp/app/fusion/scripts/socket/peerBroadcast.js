
var output = $('#peerBroadcastSection');
var websocket = '';
var currentUser = '';
var remoteUser = '';
var f = '';
var popupService;

function setPopupService(_popupService) {
	 popupService = _popupService;
}

function socketSetup(initialPageVisit,_currentUser, _remoteUser, _f) {
	


	if( true) {
		  
		var href = window.location.href;
	    var hostPatt = new RegExp(window.location.host +"/[^/]*");
	    var res = hostPatt.exec(href);
	    var protocol = window.location.protocol.replace("http","ws");
	    
	    var signalingServerPath = protocol + "//" + res + "/contact";
		  var wsUri = signalingServerPath;
		  console.log("Connecting to " + wsUri);
		  websocket = new WebSocket(wsUri);
		  //localStorage.notifySocket = JSON.stringify(websocket);
		  //window.top.notifySocket = websocket;
		  
		  currentUser = _currentUser;
		  remoteUser = _remoteUser;
		  f = socketSend;
		 
		  
	}
	
	//var websocket = JSON.parse(localStorage.notifySocket || "{}") ;
	if( websocket != null) {
		websocket.onopen = function(evt) { onOpen(evt); };
		websocket.onmessage = function(evt) { onMessage(evt); };
		websocket.onerror = function(evt) { onError(evt); };
	
	}
	
	//if(f != undefined)
	 // f();
	
	//window.top.notifySocket.send("");
}


function socketSend(currentUser, remoteUser) {
	


	 websocket.send(JSON.stringify({
         from: currentUser,
         to: remoteUser
     }));
	
	//window.top.notifySocket.send("");
}




function onOpen(evt) {
    console.log("onOpen");
    //writeToScreen("CONNECTED");
    
    if(f != undefined)
		f(currentUser, remoteUser);
    
}

function onMessage(evt) {
    if (typeof evt.data == "string") {
        writeToScreen("RECEIVED (text): " + evt.data);
        
        if(popupService != undefined) {
        	popupService.showMessage("Call Request","You are being contacted by " + JSON.parse(evt.data).from + ". Please click on the online icon and then click view");
        	
        }
        //if (confirm("You are being contacted by " + JSON.parse(evt.data).from )) {
           
	    //}
        
    } else {
        writeToScreen("RECEIVED (binary): " + evt.data);
    }
}

function onError(evt) {
    writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
}

function writeToScreen(message) {
    var pre = document.createElement("p");
    pre.style.wordWrap = "break-word";
    pre.innerHTML = message;
    output.append(pre);
}
