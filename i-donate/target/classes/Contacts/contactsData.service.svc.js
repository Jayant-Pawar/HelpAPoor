(function() {
  var module = angular.module("ContactsApp");

  module.service("ContactsDataSVC", function(){
    this.contacts=[
  		{
  			"gender":"female",
  			"name":	{
  						"title":"miss",
  						"first":"thaïs",
  						"last":"nguyen"
  					},
  			"location":{
  						"street":"7314 avenue tony-garnier",
  						"city":"mulhouse",
  						"state":"vosges",
  						"postcode":43633
  						},
  			"email":"thaïs.nguyen@example.com",
  			"login":{
  						"username":"bluegorilla376",
  						"password":"sabbath",
  						"salt":"NH7xLVGz",
  						"md5":"5e0c50dc1684863e799d8900e61a0c23",
  						"sha1":"f10aa1efb989249b71b615d39e30e8b8b171ff4d",
  						"sha256":"cd308bd870eb1f8b97ba507c499d19f791f9e0e1738c858e2650cc6d603a7cc7"
  					},
  			"dob":"1988-12-20 01:34:56",
  			"registered":"2006-06-14 09:23:24",
  			"phone":"04-82-07-46-87",
  			"cell":"06-94-23-83-19",
  			"id":{
  					"name":"INSEE",
  					"value":"2881138948034 17"
  				 },
  			"picture":{
  						"large":"https://randomuser.me/api/portraits/women/9.jpg",
  						"medium":"https://randomuser.me/api/portraits/med/women/9.jpg",
  						"thumbnail":"https://randomuser.me/api/portraits/thumb/women/9.jpg"
  						},
  			"nat":"FR"
  		},
  		{
           "gender":"female",
           "name":{
              		"title":"mrs",
              		"first":"afsar",
              		"last":"özkara"
           		},
           "location":{
              			"street":"5189 kushimoto sk",
              			"city":"adiyaman",
              			"state":"malatya",
              			"postcode":32680
           			},
           "email":"afsar.özkara@example.com",
           "login":{
           		   "username":"tinygorilla963",
              		"password":"fatty",
              		"salt":"nyCsjnri",
              		"md5":"f3572358476037b32972e37c457cc4be",
              		"sha1":"d9a90691764a9471eb97e27a959a227e750d8733",
              		"sha256":"27d5bf14f6f58ccb3eb2cc71515b5c4c0f42500721b20cbf9c089c38e0258cbe"
           		  },
           "dob":"1988-04-19 16:03:02",
           "registered":"2008-12-12 04:29:41",
           "phone":"(345)-704-7921",
           "cell":"(036)-144-7077",
           "id":{
              	"name":"",
              	"value":null
           	  },
           "picture":{
              		"large":"https://randomuser.me/api/portraits/women/46.jpg",
              		"medium":"https://randomuser.me/api/portraits/med/women/46.jpg",
              		"thumbnail":"https://randomuser.me/api/portraits/thumb/women/46.jpg"
           			},
           "nat":"TR"
          }
  	];

  });

})();
