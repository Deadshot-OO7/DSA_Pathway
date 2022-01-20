
class Emp:
    def __init__(self, eid, name, sal, email):
        self.Name = name
        self.Salary = sal
        self.Email = email
        self.setEid(eid)

    def setEid(self, eid):
        if type(eid) is int and eid > 0:
            self.__eid = eid
        else:
            print("POSITIVE INTEGER ONLY FOR EMPLOYEE ID")

    def getEid(self):
        return self.__eid

    def showDetails(self):
        print("Employee Id::", self.getEid())
        print("Employee Name::", self.Name)
        print("Employee Salary::", self.Salary)
        print("Employee Email::", self.Email)
        # if self.__eid > 0 and type(self.__eid) is int:
        #     print("Empoyee Id::", self.__eid)
        #     print("Empoyee Name::", self.Name)
        #     print("Empoyee Salary::", self.Salary)
        #     print("Empoyee Email::", self.Email)


emp1 = Emp("ads", "Akash", 70000, "akash@gmail.com")
emp1.showDetails()
del emp1
