package pockbox.designpattern.composite14;

import java.util.List;

/*
 * �ļ��ڵ����(���ļ���Ŀ¼�ĸ���)
 */
public interface IFile {
	
	//��ʾ�ļ������ļ��е�����
	public void display();
	
	//���
	public boolean add(IFile file);
	
	//�Ƴ�
	public boolean remove(IFile file);
	
	//����ӽڵ�
	public List<IFile> getChild();
}
