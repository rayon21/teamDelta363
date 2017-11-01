$(document).ready(function(){
			$("#chooseStartDateTime").datetimepicker({
				dayOfWeekStart:0,
				stepMinute: 30,
				lang: 'en',
				minDate: 0,
				formatTime: 'g:i a',
			});
			$("#chooseEndDateTime").datetimepicker({
				dayOfWeekStart:0,
				lang: 'en',
				//minDate will be modified to create a condition that startDateTime < endDateTime
				//currerntly, minDate == today
				minDate: new Date(getDateTime("chooseStartDateTime","startdatetime")),
				formatTime: 'g:i a',
			});
			document.getElementById("chooseStartDateTime").value = '';
			document.getElementById("startdatetime").value = '';
			document.getElementById("chooseEndDateTime").value = '';
			document.getElementById("enddatetime").value = '';
		});

		function setDateTime(e, inputId){
			document.getElementById(inputId).value = e.value;
		}

		function getDateTime(pickerId, inputId){
			var x = document.getElementById(pickerId).value;
			document.getElementById(pickerId).value = '';
			document.getElementById(inputId).value = '';
			return x;
		}

		//This function is temp. when DB supports table {R_id, startDate, startTime, endDate, endTime}, this will be removed.
		function deleteEventDate(start,end,list,index,len){
			var newString = "";
			var tobermvd = "";
			if(len==1){
			    tobermvd = start+"-"+end;
			}else if(index==len-1 && len>0){
			    tobermvd = ", "+start+"-"+end;
			}else{
			    tobermvd = start+"-"+end+", ";
			}
			newString = list.replace(tobermvd,"");
			return newString;
		}


