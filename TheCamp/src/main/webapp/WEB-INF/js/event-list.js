function Events($scope, $http) {
	$http.get('http://localhost:8080/EventTracker/candidateList.json').
		success(function(data) {
			$scope.events = data;
		});
}

