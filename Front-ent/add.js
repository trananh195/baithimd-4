function showFormAdd(){
    document.getElementById('body').innerHTML = `
    <table>
        <tr>
        <td><input type="text" id="name" placeholder="Input Name: "></td>
        </tr>
        <tr>
        <td><input type="text" id="age" placeholder="Input age : "></td>
        </tr>
        <tr>
        <td><input type="text" id="salary" placeholder="Input salary : "></td>
        </tr>
        <tr>
        <td><input type="text" id="department_id" placeholder="Input department_id : "></td>
        </tr>
        <tr>
        <td><button onclick="addStaff()">Add Staff</button></</td>
</tr>
    </table>`
}
function addStaff() {
    let data = {
        name: document.getElementById('name').value,
        age: document.getElementById('age').value,
        salary: document.getElementById('salary').value,
        department: {
            id: document.getElementById('department_id').value
        }
    }
    axios.post('http://localhost:8080/staff', data).then(res => {
        console.log(res)
        showAll()
    })
}