var module = angular.module("nestedControllerApp",[]);
//Register controller for the module. First argument is ng-controller referred in html, 2nd argument is method name in js
module.controller("nestedController1", Ctrl1);
module.controller("nestedController2", Ctrl2);

function Ctrl1() //when using controlleras syntax, it internally adds $scope
{
	this.testProp = "From Ctrl1";
}

function Ctrl2()
{
	this.testProp = "From Ctrl2";	
}