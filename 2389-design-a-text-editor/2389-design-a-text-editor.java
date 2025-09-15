class TextEditor {
    private StringBuilder sb;
    int ind=0;
    public TextEditor() {
        this.sb=new StringBuilder();
    }
    
    public void addText(String text) {
        sb.insert(ind,text);
        ind+=text.length();
    }
    
    public int deleteText(int k) {
        int deleteCount = Math.min(k, ind);
        sb.delete(ind-deleteCount,ind);
        ind-=deleteCount;
        return deleteCount;
    }
    
    public String cursorLeft(int k) {
        ind=Math.max(0, ind - k);
        int temp=Math.max(0,ind-10);
        return sb.substring(temp,ind);
    }
    
    public String cursorRight(int k) {
        ind = Math.min(sb.length(), ind + k);
        int temp=Math.max(0,ind-10);
        return sb.substring(temp,ind);
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */