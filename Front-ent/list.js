let str ="";
function showAll(){
    axios.get('http://localhost:8080/staff').then((res) => {
        let data = res.data;
        for (let i = 0; i < data.length; i++) {
            str += `<div>${data[i].name} ${data[i].age} ${data[i].salary} ${data[i].department.name}
 <button onclick="deleteStaff(${data[i].id})">Delete</button>
  <button onclick="showFormUpdate(${data[i].id})">Update</button>
  </div>`

        }
        document.getElementById('body').innerHTML = str
    })
}
function showFormUpdate(id){
    axios.get('http://localhost:8080/staff/' + id).then((res) => {
        console.log(res.data)
        let data = res.data;
        str = `<table>
        <tr>
        <td><input type="text" id="id" value="${data.id}"></td>
        </tr>
        <tr>
        <td><input type="text" id="name" value="${data.name}"></td>
        </tr>
        <tr>
        <td><input type="text" id="age" value="${data.age}"></td>
        </tr>
         <tr>
        <td><input type="text" id="salary" value="${data.salary}"></td>
        </tr>
        <tr>
        <td><input type="text" id="department_id" value="${data.department.name}"></td>
        </tr>
        <tr>
        <td><button onclick="updateStaff()">Update </button></</td>
</tr>
    // </table>`
        document.getElementById('body').innerHTML = str;
    })

}
function deleteStaff(id) {
    console.log('ok')
    axios.delete(`http://localhost:8080/staff/` + id).then(res => {
        showAll();
    });
}
function updateStaff() {
    let data = {
        id: document.getElementById('id').value,
        name: document.getElementById('name').value,
        age: document.getElementById('age').value,
        salary: document.getElementById('salary').value,
        department: {
            id: document.getElementById('department_id').value
        }
    }
    console.log(data)
    axios.put('http://localhost:8080/staff/' + data.id, data).then((res) => {
        showAll()
    })
}

