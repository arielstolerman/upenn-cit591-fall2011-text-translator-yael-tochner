package textTranslator;

import java.awt.Frame;

import javax.swing.JComboBox;

class TextTranslator extends Frame {
    JComboBox Translate;


    /**
     * @param args
     */
    
    public static void main(String[] args) {
        new TextTranslator().createGui();
        
    }

    void createGui() {
        Translate = new JComboBox(new String[] {"Identity", "Detab", "Entab", "Single space",
                    "Double space", "Wrap Text", "Flow Text", "Fix Indentation"});     
    }
    
    private void addTranslator(TranslatorInterface translator) {
        
    }
    //Other methods as appropriate to create the GUI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    class TranslateListener implements ActionListener{
        
        public TranslateListener(TranslatorInterface translator) {
            
        }
        
        public void actionPerformed(ActionEvent arg0) {
            
        }
    }
}
