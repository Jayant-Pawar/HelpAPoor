var module = angular.module("dataModelApp",[]);
module.controller("dataModelCtrl", dataCtrl);

function dataCtrl($scope)
{
	$scope.textBoxChange = function()
	{
		console.log("textBoxChanged")
	}

}