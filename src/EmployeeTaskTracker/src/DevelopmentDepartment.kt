class DevelopmentDepartment : Department() {
    override val departmentName: String = "Отдел разработки"

    override fun printDepartmentGoal() {
        println("Цель отдела разработки: Писать чистый и поддерживаемый код")
    }
}