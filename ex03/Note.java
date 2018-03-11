package by.ldy.hw4.ex03;

public class Note {

		
		private String text;
		private Date date;
		private boolean isActual;
		
		
		public Note() {
			
		}
		
		public Note(String text, Date date, boolean isActual) {
			super();
			this.text = text;
			this.date = date;
			this.isActual = isActual;
			
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public boolean isActual() {
			return isActual;
		}
		public void setActual(boolean isActual) {
			this.isActual = isActual;
		}

				
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + (isActual ? 1231 : 1237);
			result = prime * result + ((text == null) ? 0 : text.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Note other = (Note) obj;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (isActual != other.isActual)
				return false;
			if (text == null) {
				if (other.text != null)
					return false;
			} else if (!text.equals(other.text))
				return false;
			return true;
		}
		
		
		/*@Override
		public int compareTo(Note arg0) {
			int year1;
			int year2;
			
			year1=date.getYear();
			year2=arg0.getDate().getYear();
			
			if(year1>year2){
				return 1;
			}
			
			if(year1<year2){
				return -1;
			}
			return 0;
		}*/
		
		
		
}
