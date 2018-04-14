/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

JW_APP_NAME.directive('ionSlider', ionSlider);

function ionSlider($timeout) {
    return {
        restrict: 'EA',
        template: '<div></div>',
        replace: true,
        scope: {
            min: '=',
            max: '=',
            type: '@',
            prefix: '@',
            maxPostfix: '@',
            prettify: '=',
            prettifySeparator: '@',
            grid: '=',
            gridMargin: '@',
            postfix: '@',
            step: '@',
            hideMinMax: '@',
            hideFromTo: '@',
            from: '=',
            to: '=',
            disable: '=',
            onChange: '=',
            onFinish: '=',
            values: '=',
            timeout: '@'
        },
        link: function ($scope, $element) {
            $element.ionRangeSlider({
                min: $scope.min,
                max: $scope.max,
                type: $scope.type,
                prefix: $scope.prefix,
                maxPostfix: $scope.maxPostfix,
                prettify_enabled: $scope.prettify,
                prettify_separator: $scope.prettifySeparator,
                grid: $scope.grid,
                gridMargin: $scope.gridMargin,
                postfix: $scope.postfix,
                step: $scope.step,
                hideMinMax: $scope.hideMinMax,
                hideFromTo: $scope.hideFromTo,
                from: $scope.from,
                to: $scope.to,
                disable: $scope.disable,
                onChange: $scope.onChange,
                onFinish: $scope.onFinish,
                values: $scope.values
            });

            $scope.$watch('min', function (value) {
                $timeout(function () {
                    $element.data("ionRangeSlider").update({min: value});
                });
            }, true);
            $scope.$watch('max', function (value) {
                $timeout(function () {
                    $element.data("ionRangeSlider").update({max: value});
                });
            });
            $scope.$watch('from', function (value) {
                $timeout(function () {
                    $element.data("ionRangeSlider").update({from: value});
                });
            });
            $scope.$watch('to', function (value) {
                $timeout(function () {
                    $element.data("ionRangeSlider").update({to: value});
                });
            });
            $scope.$watch('disable', function (value) {
                $timeout(function () {
                    $element.data("ionRangeSlider").update({disable: value});
                });
            });
        }
    };
}
