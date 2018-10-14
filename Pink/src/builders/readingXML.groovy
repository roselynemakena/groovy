package builders

def xml = '''
<sports>
  <sport id='1'>
    <name>Basketball</name>
  </sport>
    <sport id='1'>
    <name>BaseBall</name>
  </sport>
    <sport id='1'>
    <name>Hockey</name>
  </sport>
    <sport id='1'>
    <name>Gogoball</name>
  </sport>
    <sport id='1'>
    <name>Table tennis</name>
  </sport>
  </sports>
'''

def sports = new XmlSlurper().parseText(xml)
println(sports.getClass().getName())
println(sports)

println("---------")
println sports.sport[2].name
