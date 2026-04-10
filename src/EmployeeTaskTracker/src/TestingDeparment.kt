class TestingDepartment : Department() {
    override val departmentName: String = "Отдел тестирования"

    override fun printDepartmentGoal() {
        println("Цель отдела тестирования: Находить все баги до релиза")
    }
}