/**
 * 
 */

var module = angular.module("clockApp",[]);
module.controller("ClockCntrl", getTime);

function getTime()
{
	
	var currentDate= new Date();
	this.currentTime = currentDate.toTimeString();
	this.updateTime=function (){
		currentDate = new Date();
		this.currentTime = currentDate.toTimeString();
	}
	
	this.username="";
	this.list = [1,2,3,4];
	this.jsonList = [
		{'name':'JP','age':'29'},
		{'name':'AP','age':'27'} 
	];
}
