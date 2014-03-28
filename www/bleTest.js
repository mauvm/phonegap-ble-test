( function() {
	"use strict";

	var exec = require( 'cordova/exec' );

	window.bleTest = function( cb ) {
		exec(
			function() {
				cb( null, true );
			},
			function() {
				cb( null, false );
			},
			'BleTestPlugin',
			'test',
			[]
		);
	};
} );