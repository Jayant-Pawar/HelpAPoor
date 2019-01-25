
var module = angular.module("ContactsApp",[]);
module.controller("ContactsCntrl", ContactsCntrl);
module.controller("HeaderCtrl", HeaderCtrl);
module.controller("FooterCtrl", FooterCtrl);

module.value("AppDataSVC", {
	"AppName" : "ContactsApp",
	"Author" : "Jayant",
	version:1});


function ContactsCntrl(ContactsDataSVC)
{
	this.contacts= ContactsDataSVC.contacts;

	this.selectedContact = this.contacts[0];
	this.selectContact = function(index)
	{
		this.selectedContact = this.contacts[index];
	}

}


function HeaderCtrl(AppDataSVC)
{
	this.appTitle=AppDataSVC.AppName;
}

function FooterCtrl(AppDataSVC)
{
	this.appTitle=AppDataSVC.AppName;
}
