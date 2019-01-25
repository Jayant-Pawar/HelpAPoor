var module = angular.module("calculator",[]);
module.controller("calcCtrl", calcController);

function calcController($scope)
{
	$scope.string1="";
	$scope.string2="";
	$scope.result ="";
	$scope.updateResult = function(){
		console.log("function called");
	}

	$scope.buttonClicked = function(button)
	{
		$scope.selectedOperation=button;
		if(button=='+')
		{
			$scope.result=parseInt($scope.string1) + parseInt($scope.string2);	
		}
		else if(button=='-')
		{
			$scope.result=parseInt($scope.string1) - parseInt($scope.string2);	
		}
		if(button=='*')
		{
			$scope.result=parseInt($scope.string1) * parseInt($scope.string2);	
		}
		if(button=='/')
		{
			$scope.result=parseInt($scope.string1) / parseInt($scope.string2);	
		}
	}
	$scope.add = function(){
		$scope.selectedOperation="+";
		$scope.result=parseInt($scope.string1) + parseInt($scope.string2);
	}

	$scope.subtract = function(){
		$scope.selectedOperation="-";
		$scope.result=parseInt($scope.string1) - parseInt($scope.string2);
	}

	$scope.multiply = function(){
		$scope.result=parseInt($scope.string1) * parseInt($scope.tring2);
	}

	$scope.divide = function(){
		$scope.result=parseInt($scope.string1) / parseInt($scope.string2);
	}
}