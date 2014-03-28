( function() {
	"use strict";

	var exec = require( 'cordova/exec' );

	window.bletest = function( cb ) {
		exec(
			function() {
				cb( null, true );
			},
			function( error ) {
				cb( error, false );
			},
			'BLETestPlugin',
			'test',
			[]
		);
	};
} )();