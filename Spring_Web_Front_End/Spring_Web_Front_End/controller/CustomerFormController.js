//customer array
var cusArr = [];

//URL to backend
let baseURL = "http://localhost:8080/Test_Maven_war_exploded/";

$('#btnSave').click(function () {
    saveCustomer();
});
$('#btnLoadAll').click(function () {
    loadAllCustomers();
});
$('#btnUpdate').click(function () {
    updateCustomer($('#txtId').val(), $('#txtName').val(), $('#txtAddress').val(), $('#txtSalary').val());
});
$('#btnDelete').click(function () {
    deleteCustomer($('#txtId').val());
});

//search customer
function searchCustomerByID(id) {
    for (const customer of cusArr) {
        if (customer._id = id) {
            return customer;
        }
    }
    return null;
}

//save customer
function saveCustomer() {
    var formData = $("#customerForm").serialize();

    console.log($('#txtId').val())
    console.log($('#txtName').val())
    console.log($('#txtAddress').val())
    console.log($('#txtSalary').val())
    console.log(formData);

    // console.log($("#txtId").val());
    // console.log($("#txtName").val());

    // alert("clicked!");

    $.ajax({
        url: baseURL + "customer",
        method: "post",
        data: {
            "id": $('#txtId').val(),
            "name": $('#txtName').val(),
            "address": $('#txtAddress').val(),
            "salary": $('#txtSalary').val()
        },
        dataType: "json",
        success: function (res) {
            alert(res.message);
        },
        error: function (error) {
            // var jsObject = JSON.parse(error.responseText);
            // alert(jsObject.message);
        }
    });
    //////////////////////////////////////////

    var id = $('#txtId').val();
    var name = $('#txtName').val();
    var address = $('#txtAddress').val();
    var salary = $('#txtSalary').val();
    var c = new Customer(id, name, address, salary);
    //save on array
    cusArr.push(c);

    var row = '<tr><td>' + id + '</td><td>' + name + '</td><td>' + address + '</td><td>' + salary + '</td></tr>';
    // add to table
    $('#tblCustomer').append(row);
    clearInputFields();
}

//get all customers
function loadAllCustomers() {
    $('#tblCustomer').empty();
    for (const customer of cusArr) {
        var row = '<tr><td>' + customer._id + '</td><td>' + customer._name + '</td><td>' + customer._address +
            '</td><td>' + customer._salary + '</td></tr>';
        // add to table
        $('#tblCustomer').append(row);
    }
    //get table row click
    // bindRowClickEvents();
    $("#txtId").focus();

    // $.ajax({
    //     url: baseURL+"customer",
    //     dataType: "json",
    //     success: function (resp) {
    //         console.log(resp);
    //         for (let cus of resp.data) {
    //             var row = '<tr><td>' + cus.id + '</td><td>' + cus.name + '</td><td>' + cus.address + '</td><td>' + cus.salary + '</td></tr>';
    //             $("#tblCustomer").append(row);
    //         }
    //         // bindRowClickEvents();
    //         // setTextFieldValues("","","","");
    //         $("#txtCustomerID").focus();
    //     }
    // });
}

//update customer
function updateCustomer(id, name, address, salary) {
    let customer = searchCustomerByID(id);

    //update in database
    // $.ajax({
    //     url: baseURL+'customer',
    //     method: 'put',
    //     contentType:"application/json",
    //     data:JSON.stringify(customer),
    //     dataType:"json",
    //     success: function (res) {
    //         alert(res.message);
    //     },
    //     error:function (error){
    //         // let cause= JSON.parse(error.responseText).message;
    //         // alert(cause);
    //     }
    // });

    if (customer != null) {
        customer._name = name;
        customer._address = address;
        customer._salary = salary;
        //refresh table
        loadAllCustomers();
    }
}

// delete customer
function deleteCustomer(id) {
    let customer = searchCustomerByID(id);

    if (customer != null) {
        //remove from database
        $.ajax({
            url: baseURL+"customer?id=" + id,
            method: "delete",
            dataType:"json",
            success: function (resp) {
                alert(resp.message);
            },
            error:function (error){
                // alert(JSON.parse(error.responseText).message);
            }
        });

        let indexNumber = cusArr.indexOf(customer);
        //remove from the array
        cusArr.splice(indexNumber, 1);
        //refresh table
        loadAllCustomers();
        return true;
    } else {
        return false;
    }
}

// clear input fields
function clearInputFields() {
    $('#txtId').val("");
    $('#txtName').val("");
    $('#txtAddress').val("");
    $('#txtSalary').val("");
}

// //get table row data
// function bindRowClickEvents() {
//     $("#tblCustomer>tr").click(function () {
//         let id = $(this).children(":eq(0)").text();
//         let name = $(this).children(":eq(1)").text();
//         let address = $(this).children(":eq(2)").text();
//         let salary = $(this).children(":eq(3)").text();
//         //set values to text fields
//         $('#txtId').val(id);
//         $('#txtName').val(name);
//         $('#txtAddress').val(address);
//         $('#txtSalary').val(salary);
//     });
// }


