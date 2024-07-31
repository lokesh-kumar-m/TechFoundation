class Details{
   private String name;
   private String preferredName;
   private boolean isWorking;
   private int age;
   private double currentLpa;
   private double expectedLpa;
   private boolean intrestConflict;

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public String getPreferredName() {
      return preferredName;
   }
   public void setPreferredName(String preferredName) {
      this.preferredName = preferredName;
   }

   public boolean isWorking() {
      return isWorking;
   }
   public void setWorking(boolean isWorking) {
      this.isWorking = isWorking;
   }

   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }

   public double getCurrentLpa() {
      return currentLpa;
   }
   public void setCurrentLpa(double currentLpa) {
      this.currentLpa = currentLpa;
   }

   public double getExpectedLpa() {
      return expectedLpa;
   }
   public void setExpectedLpa(double expectedLpa) {
      this.expectedLpa = expectedLpa;
   }
   
   public boolean isIntrestConflict() {
      return intrestConflict;
   }
   public void setIntrestConflict(boolean intrestConflict) {
      this.intrestConflict = intrestConflict;
   }
   
   @Override
   public String toString() {
      return "Details [name=" + name + ", preferredName=" + preferredName + ", isWorking=" + isWorking + ", age=" + age
            + ", currentLpa=" + currentLpa + ", expectedLpa=" + expectedLpa + ", intrestConflict=" + intrestConflict
            + "]";
   }

   
}