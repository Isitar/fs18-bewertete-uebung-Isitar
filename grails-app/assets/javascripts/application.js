// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-3.3.1.min
//= require bootstrap.bundle.min
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
    (function($) {
        $(document).ajaxStart(function() {
            $('#spinner').fadeIn();
        }).ajaxStop(function() {
            $('#spinner').fadeOut();
        });
    })(jQuery);
}



$(document).ready(function () {
    // sorry for this ugly hack, but easier than generating all this boilerplate code :)
    $('.home').each(function () {
        $(this).attr('href', '/masterData');
    });

    // fancy icons for collapses
    var collapses = $('.collapse');

    collapses.on('shown.bs.collapse', function () {
        var headerElem = $('#' + ($(this).attr('aria-labelledby')));
        var icon = headerElem.find('i');
        icon.removeClass('fa-angle-down');
        icon.addClass('fa-angle-up')
    });

    collapses.on('hidden.bs.collapse', function () {
        var headerElem = $('#' + ($(this).attr('aria-labelledby')));
        var icon = headerElem.find('i');
        icon.removeClass('fa-angle-up');
        icon.addClass('fa-angle-down')
    });


});