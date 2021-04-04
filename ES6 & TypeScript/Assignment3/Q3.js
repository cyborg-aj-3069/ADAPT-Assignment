var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.prototype.printAll = function (Objects) {
        console.log('Circle ' + Objects);
    };
    return Circle;
}());
var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.printAll = function (Objects) {
        console.log('Employee: ' + Objects);
    };
    return Employee;
}());
var o = new Employee();
o.printAll('Vinnu');
var r = new Circle();
r.printAll('is drawn');
