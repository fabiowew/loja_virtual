SELECT CONSTRAINT_NAME
FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
WHERE TABLE_NAME = 'usuario_acesso'
	AND COLUMN_NAME = 'acesso_id' and CONSTRAINT_NAME <> 'unique_acesso_user';
	
	
alter table usuario_acesso drop CONSTRAINT "ukfhwpg5wu1u5p306q8gycxn9ky";