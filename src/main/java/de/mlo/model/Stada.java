package de.mlo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * The Class Stada.
 */
@Entity
public class Stada extends BaseEntity {

	/** The student. */
	@Setter
	private Student student;
	
	/** The institut. */
	@OneToOne
	private Institut institut;
	
	/** The exam category. */
	@OneToOne
	private examCategory examCategory;
	
	/** The mark. */
	@Column
	
	/**
	 * Gets the mark.
	 *
	 * @return the mark
	 */
	@Getter
	
	/**
	 * Sets the mark.
	 *
	 * @param mark the new mark
	 */
	@Setter
	private int mark;
	
	/** The employee one. */
	@OneToOne
	private Employee employeeOne;
	
	/** The employee two. */
	@OneToOne
	private Employee employeeTwo;
	
	/** The start. */
	@Column
	
	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	@Getter
	
	/**
	 * Sets the start.
	 *
	 * @param start the new start
	 */
	@Setter
	private Date start;
	
	/** The end. */
	@Column
	
	/**
	 * Gets the end.
	 *
	 * @return the end
	 */
	@Getter
	
	/**
	 * Sets the end.
	 *
	 * @param end the new end
	 */
	@Setter
	private Date end;
	
	/** The due. */
	@Column
	
	/**
	 * Gets the due.
	 *
	 * @return the due
	 */
	@Getter
	
	/**
	 * Sets the due.
	 *
	 * @param due the new due
	 */
	@Setter
	private Date due;
	
	/** The pause. */
	@Column
	
	/**
	 * Gets the pause.
	 *
	 * @return the pause
	 */
	@Getter
	
	/**
	 * Sets the pause.
	 *
	 * @param pause the new pause
	 */
	@Setter
	private Date pause;
	
	/** The ban. */
	@Column
	
	/**
	 * Gets the ban.
	 *
	 * @return the ban
	 */
	@Getter
	
	/**
	 * Sets the ban.
	 *
	 * @param ban the new ban
	 */
	@Setter
	private Date ban;
	
	/** The stada no. */
	@Column
	
	/**
	 * Gets the stada no.
	 *
	 * @return the stada no
	 */
	@Getter
	
	/**
	 * Sets the stada no.
	 *
	 * @param stadaNo the new stada no
	 */
	@Setter
	private int stadaNo;
	
	/** The title. */
	@Column
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	@Getter
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	@Setter
	private String title;
	
	/** The note. */
	@Column
	
	/**
	 * Gets the note.
	 *
	 * @return the note
	 */
	@Getter
	
	/**
	 * Sets the note.
	 *
	 * @param note the new note
	 */
	@Setter
	private String note;
	
	/** The is public. */
	@Column
	
	/**
	 * Checks if is public.
	 *
	 * @return true, if is public
	 */
	@Getter
	
	/**
	 * Sets the public.
	 *
	 * @param isPublic the new public
	 */
	@Setter
	private boolean isPublic;
	
	/** The is released. */
	@Column
	
	/**
	 * Checks if is released.
	 *
	 * @return true, if is released
	 */
	@Getter
	
	/**
	 * Sets the released.
	 *
	 * @param isReleased the new released
	 */
	@Setter
	private boolean isReleased;
	
	/** The tries. */
	@Column
	
	/**
	 * Gets the tries.
	 *
	 * @return the tries
	 */
	@Getter
	
	/**
	 * Sets the tries.
	 *
	 * @param tries the new tries
	 */
	@Setter
	private int tries;
	
	/** The usl. */
	@Column
	
	/**
	 * Checks if is usl.
	 *
	 * @return true, if is usl
	 */
	@Getter
	
	/**
	 * Sets the usl.
	 *
	 * @param USL the new usl
	 */
	@Setter
	private boolean USL;
	
	
	/**
	 * Gets the student.
	 *
	 * @return the student
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinTable(name = "student_stadas", joinColumns = { @JoinColumn(name = "stada_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "student_id", referencedColumnName = "id") })
	public Student getStudent() {
		return this.student;
		
	}
}
