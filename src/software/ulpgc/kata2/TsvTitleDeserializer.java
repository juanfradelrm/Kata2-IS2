package software.ulpgc.kata2;

public class TsvTitleDeserializer implements  TitleDeserializer{
    @Override
    public Title deserialize(String line) {
        return deserialize(line.split("\t"));
    }

    private Title deserialize(String[] fields) {
        return new Title(fields[3],toInt(fields[5]),toInt(fields[7]),fields[1]);
    }

    private int toInt(String field) {
        return field.equals("\\N") ? 0: Integer.parseInt(field);
    }
}
