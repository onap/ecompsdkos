
appDS2.controller('nbookController', ['$scope', '$location','$window','$http', function ($scope,$location,$window,$http) { 
	
	$scope.keyValueList = [{}];
	//console.log('onload nbookController');
	$scope.submitParameters = function() {
		
		$scope.iframevisibility = false;
		console.log('Inside nbook invoke save');
		
		$scope.postData = {};
		
		$scope.additionalqueryParams = {};
		
	//Use this if there is only one 1 query param key value pair 
		$scope.additionalqueryParams.paramKey = $scope.qparamKey;
		$scope.additionalqueryParams.paramVal = $scope.qparamVal;
		
		
	//	console.log('$scope.additionalqueryParams',$scope.additionalqueryParams);
		//console.log('$scope.notebookvalue',$scope.notebookvalue);
		
		
		//$scope.postData['notebookid'] = 'a06a9cf14211012e221bf842c168849d';
		//$scope.postData['param1'] = 'p1';
		//$scope.postData['param2'] = 'p2';
		
		//console.log('Report Schedule object', $scope.reportScheduleObject);
		
	
		/* if ($window.location.search.substr($window.location.search.indexOf("=")+1)) {
			$scope.queryParams = $window.location.search;
			
			if ($window.location.search.indexOf("&")!=-1) {
				$scope.notebookparam = $window.location.search.substring($window.location.search.indexOf("?")+1,$window.location.search.indexOf("&"));
				$scope.additionalqueryParams = JSON.parse('{"' + decodeURI($scope.queryParams.substr($scope.queryParams.indexOf("&")+1).replace(/&/g, "\",\"").replace(/=/g,"\":\"")) + '"}');
				console.log('Additional parameters present');
			}
			else {
				$scope.notebookparam = $window.location.search.substr($window.location.search.indexOf("?")+1);
				console.log('Additional parameters absent');
			}
			console.log('add parameters',$scope.additionalqueryParams);
		//	$scope.notebookid = $scope.notebookparam.substring(0,$scope.notebookparam.indexOf("="));
			$scope.notebookvalue = $scope.notebookparam.substr($scope.notebookparam.indexOf("=")+1);
			$scope.postData = $window.location.search.substr($window.location.search.indexOf("=")+1);
			console.log('Notebook value present ',$scope.notebookvalue);
		}
		else {
			$scope.notebookvalue = '833c0a69ec1433fbb2f8752af733cf0e';
			console.log('Notebook value absent ',$scope.notebookvalue);
		}*/
		
	//	$http.get("notebook.htm#/notebook-frame", {params : {"a" : "b"}})
	
	/*	$http.get("app/fusion/notebook-integration/scripts/view-models/notebook-frame.html", {params : {"a" : "b"}})
			.then(function(response) {
		      console.log("Got response from http get ");
		     // window.open ('notebook.htm#/notebook-frame','_self',false);
		  }); */
		
	//	$location.search(1, $scope.additionalqueryParams);
//	}
		//console.log('$scope.additionalqueryParams',$scope.additionalqueryParams);
//	 $scope.invokeSaveNotebook() = function() { 
	//	window.open ('notebook.htm#/notebook-frame/1/2/3','_self',false);
		
		//var testurl = 'nbooktest.htm?nid='+$scope.notebookvalue;
		//var testurl = 'nbooktest.htm?nid='+$scope.notebookvalue+'&'+encodeURIComponent(JSON.stringify($scope.additionalqueryParams));
		//	var testurl = 'notebook.htm#/notebook-frame/' + $scope.notebookvalue + '/' + encodeURIComponent(JSON.stringify($scope.additionalqueryParams));
		
	//	console.log('$scope.keyValueList',$scope.keyValueList);
		
		/*for (var obj in $scope.keyValueList) {
			for (var prop in obj) {
				  if (obj.hasOwnProperty(prop)) { 
				  // or if (Object.prototype.hasOwnProperty.call(obj,prop)) for safety...
				    console.log('property',obj[prop]);
					  //console.log("prop: " + prop.qk + " value: " + obj[prop.qk]);
				  }
				}
		}*/
		
		//console.log('$scope.keyValueList.length',$scope.keyValueList.length);
		
		var qryStr = '';
		for(var i = 0; i < $scope.keyValueList.length; i++) {
		    var obj = $scope.keyValueList[i];
		    //console.log('obj.qK',obj.qK);
		    if (obj.qK != undefined && obj.qV != undefined) { 
		    	//console.log('Inside qk defined');
		    	if (qryStr!='')
			    	qryStr = qryStr+'&'+obj.qK+'='+obj.qV;
			    else
			    	qryStr = obj.qK+'='+obj.qV;
			    
		    }
		    
		}
		//console.log('qryStr',qryStr);

		
		
		//var testurl = 'nbooktest.htm?nid='+$scope.notebookvalue+'&k1='+$scope.additionalqueryParams.paramKey+'&v1='+$scope.additionalqueryParams.paramVal;
		
	//	var testurl = 'nbooktest.htm?nid='+$scope.notebookvalue+'&'+$scope.additionalqueryParams.paramKey+'='+$scope.additionalqueryParams.paramVal;
		
		var queryurl = 'nbooktest.htm?nid='+$scope.notebookvalue+'&'+qryStr;
		
	//	var testurl = 'notebook.htm#/notebook-frame';
		
		window.open (queryurl,'_self',false);
	
		
	//	var w = window.open ('notebook.htm#/notebook-frame','_self',false);
	//	w.nid = $scope.notebookvalue;
		
		
	//	$http.post('rNotebookFE/authCr', $scope.postData).success(function(data, status) {
	/*	$http({method:'POST', url:'rNotebookFE/authCr', data: $scope.notebookvalue, params:{'qparams' : $scope.additionalqueryParams}}).success(function(data, status) {
	            console.log('Data Sent', data);
	            console.log('Status ', status);
	            
	       
	         	 
	            // iframe.name = "my_iframe";
	            
	          //  $scope.ifr = "<div><iframe src='http://www.w3schools.com'/></div>"
	          
	          //  var url = "https://rcloud.research.att.com";
	        //    document.getElementById('itestfr').src = data;
	         //   window.open ('notebook.htm#/notebook-frame/1/2/3','_self',false);
	        //   $scope.iframevisibility = true; 
	        //    document.getElementById('itestfr').src = data;
	           
			
			})*/
		
		
	} 
	
	$scope.addKeyValuePairs = function (kv) {
			
			
		if ($scope.keyValueList.length < 9) {
			$scope.keyValueList.push({  
			  
			      });
			//	alert($scope.reportRunJson.rangeAxisList.length);
			//	console.log('$scope.keyValueList',$scope.keyValueList);
			
		} else {
			//document.getElementById("addbtn").disabled = true;
			//	$scope.btnactive = false;
			document.getElementById("addbtn")["disabled"]  = true;
			//document.getElementById("addbtn")["style.background-color"]  = "#FFFF00";
			
			//$('#addbtn').btn('type') = "disabled";
		}
	}

	$scope.removeKeyValuePairs = function (index) {
		$scope.keyValueList.splice(index, 1);
		if ($scope.keyValueList.length == 8) {
			document.getElementById("addbtn")["disabled"]  = false;
		}
		//console.log($scope.hardCodeReport.rangeAxisList)
	}

}]);