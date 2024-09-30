Get-ChildItem -File | ForEach-Object {
    $directoryName = [System.IO.Path]::GetFileNameWithoutExtension($_.Name)
    New-Item -Path $directoryName -ItemType Directory
}