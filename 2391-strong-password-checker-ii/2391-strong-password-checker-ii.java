class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
		boolean digit=false;
		boolean ch=false;
		boolean bchar=false;
		boolean spec=false;
		for(int i=0;i<password.length();i++) {
            if(i+1!=password.length()){
                if(password.charAt(i)==password.charAt(i+1)) return false;
            }
			if(Character.isDigit(password.charAt(i))) digit=true;
			else if(Character.isLowerCase(password.charAt(i))) ch=true;
			else if(Character.isUpperCase(password.charAt(i))) bchar=true;
			else if("[!@#$%^&*()-+]".contains(String.valueOf(password.charAt(i)))) spec=true;
		}
        if(digit && ch && bchar && spec) return true;
	    return false;
    }
}